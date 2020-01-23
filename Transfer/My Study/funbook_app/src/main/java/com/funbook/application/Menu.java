package com.funbook.application;

public class Menu {

	public static void displayMainMenu() {
		String menu = "Enter your choice\n";
		menu = menu + "1)SignUp \n2)SignIn";
		System.out.println(menu);
	}

	public static void displayDashboard() {
		String menu = "\nEnter your choice\n";
		menu = menu
				+ "\n1)Manage Posts \n2)Manage Friends \n3)Manage Chats & Messages \n4)Manage Groups \n5)Manage your Profile \n6)Timeline";
		System.out.println(menu);
	}

	public static void displayManagePost() {
		String menu = "\nEnter your choice\n";
		menu = menu + "1)Share a Post \n2)View your Posts \n3)View your friend's Post " + "\n4)Delete a Post";
		System.out.println(menu);

	}

	public static void displayManageFriend() {
		String menu = "\nEnter your choice\n";
		menu = menu + "\n1)Send a Friend Request \n2)View Pending Friend Reuqest \n3)Accept Friend Reuqest "
				+ "\n4)Reject a Friend request  \n5)View Your Friends" + "\n6)Remove a Friend";
		System.out.println(menu);
	}

	public static void displayManageChatMessases() {
		String menu = "\nEnter your choice\n";
		menu = menu + "\n1)Inbox a Freind \n2)Check Your inbox \n3)Check your sent Items \n4)Check your Chat History";
		System.out.println(menu);

	}

	public static void displayManageGroup() {
		String menu = "\nEnter your choice\n";
		menu = menu
				+ "\n1)Create a Group \n2)View your groups \n3)View Members of your group \n4)View Public Groups "
				+ "\n5)Add a member in your group \n6)Remove a member from your group \n7)Update your Groups "
				+ "\n8)Send a request to group  \n9)View Pending Group Request \n10)Accept group request";
		System.out.println(menu);

	}

	public static void displayManageProfile() {
		String menu = "\nEnter your choice\n";
		menu = menu + "1)Update First Name \n2)Update Last Name \n3)Update Mobile Number "
				+ "\n4)Password Change \n5)Update DOB \n6)Change Account Type ";
		System.out.println(menu);

	}

	public static void displayUpdateGroup() {
		String menu = "\nEnter your choice\n";
		menu = menu
				+ "\n1)Update Group Name \n2)Update Group description \n3)Update Group Type";
		System.out.println(menu);
		
	}

	public static void displayManageTimeline() {
		String menu = "\nEnter your choice\n";
		menu = menu
				+ "\n1)View You Time Line \n2)Add Comment on a Post \n3)View Comments on a Post";
		System.out.println(menu);
		
	}

}
