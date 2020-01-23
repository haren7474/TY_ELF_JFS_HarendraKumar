package com.funbook.application;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

import com.funbook.dao.Comment;
import com.funbook.dao.Conversation;
import com.funbook.dao.Friend;
import com.funbook.dao.Group;
import com.funbook.dao.Post;
import com.funbook.dao.Timeline;
import com.funbook.dao.User;

import com.funbook.dto.ConversationDto;
import com.funbook.dto.GroupDto;
import com.funbook.dto.PostDto;
import com.funbook.dto.UserDto;

import com.funbook.utility.Validation;

public class App {
	static Iterator<UserDto> userItr = null;
	static ArrayList<UserDto> userAl = null;

	static Iterator<ConversationDto> conItr = null;
	static ArrayList<ConversationDto> conAl = null;

	static Iterator<GroupDto> groupItr = null;
	static ArrayList<GroupDto> groupAl = null;

	static Iterator<PostDto> postItr = null;
	static ArrayList<PostDto> postAl = null;

	static Iterator<String> itr = null;
	static ArrayList<String> al = null;
	static Scanner scanner = new Scanner(System.in);

	public static String readStringInput() {
		String string = scanner.nextLine();
		return string;
	}

	public static Integer readIntegerInput() {
		Integer choice = null;
		try {
			choice = scanner.nextInt();
			scanner.nextLine();

		} catch (InputMismatchException e) {
			System.out.println("Invalid Input");
		}
		return choice;
	}

	public static void main(String[] args) {
		// **********************Sign Up*******************************************
		Integer choice = 0;
		Menu.displayMainMenu();
		String password = null;
		choice = readIntegerInput();
		Integer userId = null;
		switch (choice) {
		case 1:
			System.out.println("\nEnter First Name : ");
			String firstName = null;
			do {
				firstName = readStringInput();
			} while (Validation.isStringEmpty(firstName));

			// *****Accepting Last NameInput**************
			System.out.println("\nEnter Last Name : ");
			String lastName = null;

			do {
				lastName = readStringInput();
			} while (Validation.isStringEmpty(lastName));

			// ****Accepting Mobile number Input and Validating it********
			System.out.println("\nEnter Mobile Numer : ");
			String mobileNumber = null;
			do {
				mobileNumber = readStringInput();
			} while (!Validation.checkMobile(mobileNumber));

			// *****Accepting EmailId Input and validating it!!*************
			System.out.println("\nEnter Email Id : ");
			String emailId = null;
			do {
				emailId = readStringInput();
			} while (!Validation.checkEmail(emailId));

			// *****Accepting User Name Input*************
			String userName = null;
			System.out.println("\nEnter User Name: ");
			do {
				userName = readStringInput();
			} while (!User.checkUserName(userName));

			// *****Accepting password Input and validating it!!********
			System.out.println("\nEnter password : ");

			do {
				password = readStringInput();
			} while (Validation.isStringEmpty(lastName));

			// *****Accepting Date of birth Input and validating it!!********
			System.out.println("\nEnter Date of Birth in YYYY-MM-DD Format : ");
			String dob = null;
			do {
				dob = readStringInput();
			} while (!Validation.checkDob(dob));

			// *****Accepting Account Type********
			System.out.println("\nPlease Enter: \n For Public Account Press 0\n For Private Account Press 1\n");
			Integer type = null;
			do {
				type = readIntegerInput();
				System.out.println("\nPlease Enter 0 or 1 only");
			} while (type != (0 | 1));

			User.signUp(firstName, lastName, mobileNumber, emailId, userName, password, dob, type);
			System.out.println("Signup Complete ! - " + userName + " " + emailId);
			break;
		// ********************** Sign In**********************************
		case 2:
			System.out.println("\nEnter username : ");
			userName = readStringInput();
			System.out.println("\nEnter password : ");
			password = readStringInput();
			userId = User.signIn(userName, password);

			if (userId == null) {
				System.out.println("Wrong credentials. ");
				break;
			} else if (userId != null) {
				System.out.println("*******Signin Successful*******" + "\nActive User: " + userName);
				break;
			}

		default:
			System.out.print("Not yet implemented !");
			break;
		}

		if (userId != null) {
			choice = 0;
			Menu.displayDashboard();
			choice = readIntegerInput();
			switch (choice) {

			// --------------------------------------Manage
			// Posts----------------------------------------------------
			case 1:

				choice = 0;
				Menu.displayManagePost();
				choice = readIntegerInput();
				switch (choice) {

				case 1: // Add a Post
					System.out.println("\nAdd a Post on your timeline\n");
					String post = readStringInput();
					Post.addPost(userId, post);
					System.out.println("\n**************YOUR POSTS**************" + "\n" + post);
					break;

				case 2: // View You Post
					postAl = Post.viewPost(userId);
					postItr = postAl.iterator();
					System.out.println("PostID     Post");
					if (!postItr.hasNext()) {
						System.out.println("No Post!!!");
						break;
					} else {
						System.out.println("UserPostID   Post");
						while (postItr.hasNext()) {
							PostDto dto = postItr.next();
							System.out.println(dto.getUserPostId() + " " + dto.getText());
						}
					}
					break;

				case 3: // View Friend's Post
					userAl = Friend.viewFriend(userId);
					userItr = userAl.iterator();
					if (!userItr.hasNext()) {
						System.out.println("No Friends... Go and die!!!");
						break;
					} else {
						System.out.println("UserId    UserName");
						while (userItr.hasNext()) {
							UserDto dto = userItr.next();
							System.out.println(dto.getUserId() + " " + dto.getUserName());
						}
					}
					System.out.print("\nPlease enter username from your friends listed here !\n");
					String userName = readStringInput();
					postAl = Post.viewFreindPost(userId, userName);
					System.out.println("**************YOUR FRIEND HAS POSTED**************");

					postItr = postAl.iterator();
					if (!postItr.hasNext()) {
						System.out.println("No Post from your friend!!!");
						break;
					} else {
						System.out.println("Time     Post");
						while (postItr.hasNext()) {
							PostDto dto = postItr.next();
							System.out.println(dto.getTimestamp() + " " + dto.getText());
						}
					}
					break;

				case 4:
					// Display User's PostId and Post
					postAl = Post.viewPost(userId);
					itr = al.iterator();
					System.out.println("PostID     Post");
					while (itr.hasNext()) {
						System.out.println(itr.next() + "         " + itr.next());
					}

					// Read PostId to delete Post
					System.out.println("\n****Enter Post Id which you want to delete****");
					Integer postId = readIntegerInput();
					Post.deletePost(userId, postId);
					System.out.println("\n********Your Post has been deleted******");
					break;
				}
				break;

			case 2: // *****************Manage Friend********
				choice = 0;
				Menu.displayManageFriend();
				choice = readIntegerInput();
				switch (choice) {

				case 1: // !!!!!!!!!!!Send Friend Request!!!!!

					// Listing of Funbook Users
					System.out.println("*******This is the list of Funbook Users*****");
					userAl = User.viewFunbookUsers(userId);
					userItr = userAl.iterator();

					while (userItr.hasNext()) {
						UserDto dto = userItr.next();
						System.out.println(dto.getUserName());
					}

					// Fetching requested User's Id
					System.out.println("Whom should I send your friend request?  ");
					Integer userF_id;

					do {
						userF_id = User.getUserId(readStringInput());
						if (Friend.checkFriendExists(userId, userF_id) == true) {
							System.out.println("Can't add " + User.fetchUserName(userF_id)
									+ " Please check your friend list or friend requests \nEnter another username to send friend request");
						}
					} while (Friend.checkFriendExists(userId, userF_id) == true);

					Friend.sendRequest(userId, userF_id);
					System.out.println(
							"\n***Your friend request has been sent to " + User.fetchUserName(userF_id) + "*****");
					break;

				case 2: // !!!!!!!!!!Pending Friend Request List!!!!!!
					System.out.println("*******Pending Friend Request List****");
					userAl = Friend.checkPendingRequest(userId);
					userItr = userAl.iterator();
					if (!userItr.hasNext()) {
						System.out.println("No Pending Request!!!");
						break;
					} else {
						System.out.println("UserName");
						while (userItr.hasNext()) {
							UserDto dto = userItr.next();
							System.out.println(dto.getUserName());
						}
					}
					break;

				case 3: // !!!!!!!!!!Accept Pending Request !!!!!!!!
					System.out.println("*******Pending Freind Request List****");
					userAl = Friend.checkPendingRequest(userId);
					userItr = userAl.iterator();
					if (!userItr.hasNext()) {
						System.out.println("No Pending Request!!!");
						break;
					} else {
						System.out.println("UserName");
						while (userItr.hasNext()) {
							UserDto dto = userItr.next();
							System.out.println(dto.getUserName());
						}

						System.out.println("***Enter User Name of your friend to add as your friend***");
						Integer userF_Id = User.getUserId(readStringInput());
						Friend.acceptRequest(userId, userF_Id);
						System.out.println("**You and " + User.fetchUserName(userF_Id) + " are now friends**");

					}
					break;
				case 4: // !!!!!!!!!!Reject Pending Request!!!!!!
					System.out.println("*******Pending Freind Request List****");
					userAl = Friend.checkPendingRequest(userId);
					userItr = userAl.iterator();
					if (!userItr.hasNext()) {
						System.out.println("No Pending Request!!!");
						break;
					} else {
						System.out.println("UserName");
						while (userItr.hasNext()) {
							UserDto dto = userItr.next();
							System.out.println(dto.getUserName());
						}
						// Accepting Username from request which needs to be rejected
						System.out.println("***Enter User Name, which you want to reject***");
						Integer userF_Id = User.getUserId(readStringInput());
						Friend.rejectRequest(userId, userF_Id);
						System.out.println(
								"**You have rejected friend request from " + User.fetchUserName(userF_Id) + "**");
					}
					break;

				case 5: // !!!!!!!!!View Your Friends!!!!!!!!
					userAl = Friend.viewFriend(userId);
					userItr = userAl.iterator();
					if (!userItr.hasNext()) {
						System.out.println("No Friends... Go and die!!!");
						break;
					} else {
						System.out.println("UserId    UserName");
						while (userItr.hasNext()) {
							UserDto dto = userItr.next();
							System.out.println(dto.getUserId() + " " + dto.getUserName());
						}
					}
					break;

				case 6: // !!!!!! Remove Friend!!!!!!!!!!!
					userAl = Friend.viewFriend(userId);
					userItr = userAl.iterator();
					if (!userItr.hasNext()) {
						System.out.println("No Friends... Go and die!!!");
						break;
					} else {
						System.out.println("UserName");
						while (userItr.hasNext()) {
							UserDto dto = userItr.next();
							System.out.println(dto.getUserName());
						}
					}
					Integer friendId = null;
					System.out.println("*******Enter UserName which you want to remove*****");

					do {
						friendId = User.getUserId(readStringInput());
					} while (!Friend.checkFriendExists(userId, friendId));
					Friend.removeFriend(userId, friendId);
					System.out
							.println("You have removed: -" + User.fetchUserName(friendId) + " -from your friend list");
					break;
				}
				break;

			// ------------------------------------ Manage Chats and
			// Messages-----------------------------------------------------------
			case 3:
				choice = 0;
				Menu.displayManageChatMessases();
				choice = readIntegerInput();
				switch (choice) {
				case 1:
					// Listing User's all friends
					userAl = Friend.viewFriend(userId);
					userItr = userAl.iterator();
					System.out.println("FreindId      Friend UserName");
					while (userItr.hasNext()) {
						UserDto dto = userItr.next();
						System.out.println(dto.getUserId() + " " + dto.getUserName());
					}

					// Fetching Receiver ID
					System.out.println("Whom should I send your message? UserName:  ");
					String recieverName = readStringInput();

					// Accepting Message
					System.out.println("What is your message: ");
					String inboxMessage_text = readStringInput();

					Conversation.sendMessage(userId, recieverName, inboxMessage_text);
					System.out.println("\n***Your have sent a message*****" + "\nTo " + recieverName + "\nMessage "
							+ inboxMessage_text);
					break;
				case 2:
					// Showing the List of friends of the user

					conAl = Conversation.checkInbox(userId);
					conItr = conAl.iterator();
					if (!conItr.hasNext()) {
						System.out.println("No Messages!!!");
						break;
					} else {
						System.out.println("User Name     Message");
						while (conItr.hasNext()) {
							ConversationDto conDto = conItr.next();
							System.out.println(conDto.getUserdto().getUserName() + "  " + conDto.getMessageText());
						}
					}
					break;
				case 3:
					conAl = Conversation.checkSentMessages(userId);
					conItr = conAl.iterator();
					if (!conItr.hasNext()) {
						System.out.println("No Messages!!!");
						break;
					} else {
						System.out.println("User Name     Message");
						while (conItr.hasNext()) {
							ConversationDto conDto = conItr.next();
							System.out.println(conDto.getUserdto().getUserName() + "  " + conDto.getMessageText());
						}
					}
					break;
				case 4:
					System.out.println("Here is your Friend List, Enter Friend's username to see your chat");
					userAl = Friend.viewFriend(userId);
					userItr = userAl.iterator();
					if (!userItr.hasNext()) {
						System.out.println("No Friends... Go and die!!!");
						break;
					} else {
						System.out.println("UserName");
						while (userItr.hasNext()) {
							UserDto dto = userItr.next();
							System.out.println(dto.getUserName());
						}
					}

					// Fetching Freinds'Ids from friend table, associated with the user
					String userName = App.readStringInput();
					conAl = Conversation.chatHistory(userId, userName);
					conItr = conAl.iterator();
					if (!conItr.hasNext()) {
						System.out.println("No history found!!! Send your first message to: " + userName);
						break;
					} else {
						System.out.println("Sender  Reciever  Message   TimeStamp");
						while (conItr.hasNext()) {
							ConversationDto conDto = conItr.next();
							System.out.println(User.fetchUserName(conDto.getSenderId()) + "    "
									+ User.fetchUserName(conDto.getRecieverId()) + "    " + conDto.getMessageText()
									+ "    " + conDto.getTimestamp());
						}
					}
				}
				break;
			// -------------------------------------Manage
			// Group---------------------------------------------------------------
			case 4:
				choice = 0;
				Menu.displayManageGroup();
				choice = readIntegerInput();
				switch (choice) {
				case 1:
					System.out.println("\nEnter Group Name : ");
					String groupName = readStringInput();

					System.out.println("\nEnter Group Description : ");
					String groupDesc = readStringInput();

					System.out.println("\nPlease Enter: \n For Public group Press 0\n For Private group Press 1\n");
					Integer type = null;
					do {
						type = App.readIntegerInput();
						System.out.println("\nPlease Enter 0 or 1 only");
					} while (type != (0 | 1));
					Group.createGroup(userId, groupName, groupDesc, type);
					System.out.println("Group created ! \nAdmin is: " + User.fetchUserName(userId)
							+ "  and Group Name is: " + groupName);
					break;

				case 2: // View your Groups
					groupAl = Group.viewYourGroup(userId);
					groupItr = groupAl.iterator();

					if (!groupItr.hasNext()) {
						System.out.println("No Groups!!!");
						break;
					} else {
						System.out.println("GroupId GroupName");
						while (groupItr.hasNext()) {
							GroupDto groupDto = groupItr.next();
							System.out.println(groupDto.getGroupId() + "  " + groupDto.getGroupName());
						}
					}
					break;

				case 3: // View Members of your Group
					groupAl = Group.viewYourGroup(userId);
					groupItr = groupAl.iterator();

					if (!groupItr.hasNext()) {
						System.out.println("No Groups!!!");
						break;
					} else {
						System.out.println("GroupId GroupName");
						while (groupItr.hasNext()) {
							GroupDto groupDto = groupItr.next();
							System.out.println(groupDto.getGroupId() + "  " + groupDto.getGroupName());
						}

						System.out.print("Enter Group Id: \n");
						Integer groupId = readIntegerInput();

						groupAl = Group.veiwMemberOfYourGroup(groupId);
						groupItr = groupAl.iterator();
						if (!groupItr.hasNext()) {
							System.out.println("No Members in the group!!!");
							break;
						} else {
							System.out.println("Members");
							while (groupItr.hasNext()) {
								GroupDto groupDto = groupItr.next();
								System.out.println(groupDto.getUserName());
							}
						}
					}
					break;
				case 4: // list of Funbook groups
					System.out.println("*******This is the list of Funbook groups*****");
					groupAl = Group.viewFunbookGroups(userId);
					groupItr = groupAl.iterator();
					if (!groupItr.hasNext()) {
						System.out.println("No Public Groups!!!");
						break;
					} else {
						System.out.println("GroupID  Admin       Group Name         Group Description");
						while (groupItr.hasNext()) {
							GroupDto groupDto = groupItr.next();
							System.out.println(groupDto.getGroupId() + " " + User.fetchUserName(groupDto.getAdminId())
									+ " " + groupDto.getGroupName() + " " + groupDto.getGroupDescription());
						}
					}

					break;
				case 5: // Add Member to your group

					// show users to be added
					System.out.println("*******This is the list of Funbook Users*****");
					userAl = User.viewFunbookUsers(userId);
					userItr = userAl.iterator();

					while (userItr.hasNext()) {
						UserDto dto = userItr.next();
						System.out.println(dto.getUserName());
					}

					System.out.println("\nEnter Member Name to be added: ");
					String memberName = App.readStringInput();

					// Show Admin's groups
					groupAl = Group.viewYourGroup(userId);
					groupItr = groupAl.iterator();

					if (!groupItr.hasNext()) {
						System.out.println("No Groups!!!");
						break;
					} else {
						System.out.println("Group Id  GroupName");
						while (groupItr.hasNext()) {
							GroupDto groupDto = groupItr.next();
							System.out.println(groupDto.getGroupId() + " " + groupDto.getGroupName());
						}
						Integer groupId = null;
						System.out.println("\nEnter Group Id  : ");

						do {
							groupId = App.readIntegerInput();
							if (!Group.checkAdmin(userId, groupId)) {
								System.out.println("You are not admin of this group, try Again! - ");
							}
						} while (!Group.checkAdmin(userId, groupId));

						Group.addMember(userId, memberName, groupId);
						System.out.println("You have added " + memberName + " in your group");
					}

					break;
				case 6:
					// Show Groups
					groupAl = Group.viewYourGroup(userId);
					groupItr = groupAl.iterator();

					if (!groupItr.hasNext()) {
						System.out.println("No Groups!!!");
						break;
					} else {
						System.out.println("GroupId GroupName");
						while (groupItr.hasNext()) {
							GroupDto groupDto = groupItr.next();
							System.out.println(groupDto.getGroupId() + "  " + groupDto.getGroupName());
						}

						System.out.print("Enter Group Id: \n");
						Integer groupId = readIntegerInput();

						// Show Group Members
						groupAl = Group.veiwMemberOfYourGroup(groupId);
						groupItr = groupAl.iterator();
						if (!groupItr.hasNext()) {
							System.out.println("No Members in the group!!!");
							break;
						} else {
							System.out.println("Members");
							while (groupItr.hasNext()) {
								GroupDto groupDto = groupItr.next();
								System.out.println(groupDto.getUserName());
							}
							System.out.println("\nEnter Member Name to be removed: ");
							memberName = App.readStringInput();
							if (User.getUserId(memberName) == userId) {
								System.out.println("\nAdmin can't be removed from the group, delete the group ");
								break;
							} else {
								Group.removeMember(userId, groupId, memberName);
								System.out
										.println("You have removed: -" + memberName + " -from your group: " + groupId);
							}

							break;
						}
						
					}
					
				case 7:
					// Displaying user's groups and taking input for group that user wants to update
					Integer groupId = null;
					groupAl = Group.viewYourGroup(userId);
					groupItr = groupAl.iterator();

					if (!groupItr.hasNext()) {
						System.out.println("No Groups!!!");
						break;
					} else {
						System.out.println("GroupId GroupName");
						while (groupItr.hasNext()) {
							GroupDto groupDto = groupItr.next();
							System.out.println(groupDto.getGroupId() + "  " + groupDto.getGroupName());
						}
						System.out.print("Enter Group Id that you want to update: \n");
						groupId = readIntegerInput();
					}

					if (groupId != null) {
						choice = 0;
						Menu.displayUpdateGroup();
						choice = readIntegerInput();
						switch (choice) {
						case 1:
							System.out.println("\n Enter Group Name : ");
							groupName = App.readStringInput();
							Group.updateGroupName(userId, groupName, groupId);
							System.out.println("Group Name updated as - " + groupName);
							break;

						case 2:
							System.out.println("\n Enter Group Descritption : ");
							groupDesc = App.readStringInput();
							Group.updateGroupDesc(userId, groupDesc, groupId);
							System.out.println("Group Descritption updated as - " + groupDesc);
							break;
						case 3:
							System.out.println(
									"\nPlease Enter: \nFor Public Account Press 0\n For Private Account Press 1\n");
							type = null;
							do {
								type = App.readIntegerInput();
								System.out.println("\nPlease Enter 0 or 1 only");
							} while (type != 0 && type != 1);

							Group.updateGrouptype(userId, type, groupId);
							System.out.println("group type has been updated - ");
							break;
						}
					}
					break;
				case 8:
					System.out.println("*******This is the list of Funbook groups*****");
					groupAl = Group.viewFunbookGroups(userId);
					groupItr = groupAl.iterator();
					if (!groupItr.hasNext()) {
						System.out.println("No Public Groups!!!");
						break;
					} else {
						System.out.println("GroupID  Admin       Group Name         Group Description");
						while (groupItr.hasNext()) {
							GroupDto groupDto = groupItr.next();
							System.out.println(groupDto.getGroupId() + "   " + User.fetchUserName(groupDto.getAdminId())
									+ "   " + groupDto.getGroupName() + "   " + groupDto.getGroupDescription());
						}

						System.out.print("Enter Group Id where you want to send request: \n");
						groupId = readIntegerInput();
						Group.sendRequestForGroup(userId, groupId);
						System.out.print("Your request has been sent \n");
					}

					break;

				case 9:
					System.out.println("*****Check Pending group requests*****");
					groupAl = Group.checkPendingRequestForGroup(userId);
					groupItr = groupAl.iterator();
					if (!groupItr.hasNext()) {
						System.out.println("No pending request!!!");
						break;
					} else {
						System.out.println("Group Id     Group Name           UserName");
						while (groupItr.hasNext()) {
							GroupDto groupDto = groupItr.next();
							System.out.println(groupDto.getGroupId() + "            " + groupDto.getGroupName()
									+ "       " + User.fetchUserName(groupDto.getUserId()));
						}

					}

					break;
				case 10:
					System.out.println("*****Check Pending group requests*****");
					groupAl = Group.checkPendingRequestForGroup(userId);
					groupItr = groupAl.iterator();
					if (!groupItr.hasNext()) {
						System.out.println("No pending request!!!");
						break;
					} else {
						System.out.println("Group Id     Group Name           UserName");
						while (groupItr.hasNext()) {
							GroupDto groupDto = groupItr.next();
							System.out.println(groupDto.getGroupId() + "            " + groupDto.getGroupName()
									+ "       " + User.fetchUserName(groupDto.getUserId()));
						}

						System.out.print("Enter Group Id where you want to accept request: \n");
						groupId = readIntegerInput();
						System.out.print("Enter user name whose; you want to accept request: \n");
						userId = User.getUserId(readStringInput());
						Group.acceptRequestForGroup(userId, groupId);
						System.out.print("\n" + User.fetchUserName(userId) + "  " + "has been added to the group");
					}

					break;

				}
				break;

			// ------------------------------------------Manage
			// Profile---------------------------------------------------
			case 5:
				choice = 0;
				Menu.displayManageProfile();
				choice = readIntegerInput();
				switch (choice) {
				case 1:
					System.out.println("\nEnter First Name : ");
					String firstName = App.readStringInput();
					User.updateProfileFirstName(userId, firstName);
					System.out.println("First Name updated as - " + firstName);
					break;

				case 2:
					System.out.println("\nEnter Last Name : ");
					String lastName = readStringInput();
					User.updateProfileLastName(userId, lastName);
					System.out.println("Last Name updated as - " + lastName);
					break;
				case 3:
					System.out.println("\nEnter Mobile Numer : ");
					String mobileNumber = null;
					do {
						mobileNumber = App.readStringInput();
					} while (!Validation.checkMobile(mobileNumber));
					User.updateProfileMobile(userId, mobileNumber);
					System.out.println("Mobile has been updated as - " + mobileNumber);
					break;

				case 4:
					System.out.println("\nEnter New Password : ");
					String newPassword = readStringInput();
					User.updateProfilePassword(userId, newPassword);
					System.out.println("Your password has been updated! ");
					break;
				case 5:
					System.out.println("\nEnter Date of Birth in YYYY-MM-DD Format : ");
					String dob = null;
					do {
						dob = readStringInput();
					} while (!Validation.checkDob(dob));
					User.updateProfileDOB(userId, dob);
					System.out.println("DOB has been updated as - " + dob);
					break;

				case 6:
					System.out.println("\nPlease Enter: \n For Public Account Press 0\n For Private Account Press 1\n");
					Integer type = null;
					do {
						type = App.readIntegerInput();
						System.out.println("\nPlease Enter 0 or 1 only");
					} while (type != (0 | 1));

					User.updateProfileAccountType(userId, type);
					System.out.println("Profile type has been updated - ");
					break;
				}
				break;
			// --------------------------------------------Timeline----------------------------------------------------------
			case 6:
				choice = 0;
				Menu.displayManageTimeline();
				choice = readIntegerInput();
				switch (choice) {
				case 1: // View Your TimeLine
					postAl = Timeline.myTimeline(userId);
					postItr = postAl.iterator();
					if (!postItr.hasNext()) {
						System.out.println("No Post from you and your friends!!!");
						break;
					} else {
						System.out.println("User     Post                 Time");
						while (postItr.hasNext()) {
							PostDto dto = postItr.next();
							System.out.println(dto.getUserName() + " " + dto.getText() + " " + dto.getTimestamp());
						}
					}

					break;

				case 2: // Add a comment
					Integer userPostId = null;
					String comment = null;

					// Display Friend's Post
					System.out.println("***************Your Posts***********");
					postAl = Timeline.myTimeline(userId);
					postItr = postAl.iterator();
					if (!postItr.hasNext()) {
						System.out.println("No Post from you and your friends!!!");
						break;
					} else {
						System.out.println("PostId  User   Post");
						while (postItr.hasNext()) {
							PostDto dto = postItr.next();
							System.out.println(dto.getUserPostId() + " " + dto.getUserName() + " " + dto.getText());
						}
					}

					System.out.print(
							"Enter Post Id either from your post or from friend's post; that you want to Comment: \n");
					userPostId = readIntegerInput();

					System.out.print("Enter your comment: \n");
					comment = readStringInput();

					Comment.addCommentOnPost(userPostId, userId, comment);
					System.out.print("\nYou Comment has been added");
					break;

				case 3: // View a comment

					// Display Friend's Post
					System.out.println("***************Your Posts***********");
					postAl = Timeline.myTimeline(userId);
					postItr = postAl.iterator();
					if (!postItr.hasNext()) {
						System.out.println("No Post from you and your friends!!!");
						break;
					} else {
						System.out.println("PostId  User   Post");
						while (postItr.hasNext()) {
							PostDto dto = postItr.next();
							System.out.println(dto.getUserPostId() + " " + dto.getUserName() + " " + dto.getText());
						}
					}

					System.out.print(
							"Enter Post Id either from your post or from friend's post; that you want to Comment: \n");
					Integer postId = readIntegerInput();

					System.out.println("**********View Comments***********");
					postAl = Comment.viewCommentOnPost(postId);
					postItr = postAl.iterator();
					if (!postItr.hasNext()) {
						System.out.println("No Comments on this post!!!");
						break;
					} else {
						System.out.println("User       Comment               Time");
						while (postItr.hasNext()) {
							PostDto dto = postItr.next();
							System.out.println(User.fetchUserName(dto.getUserId()) + "     " + dto.getText() + "     "
									+ dto.getTimestamp());
						}
					}
				}
				break;

			default:
				System.out.print("Invalid Entry, Try Again !");
				break;
			}

		}
	}

}
