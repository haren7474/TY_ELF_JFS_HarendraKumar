import { Pipe, PipeTransform } from '@angular/core';
import { User } from './users';

@Pipe({
  name: 'filterUser'
})
export class FilterUserPipe implements PipeTransform {

  transform(users: User[], search: string): User[] {
    if (search === undefined) {
      return users;
    } else {
      return users.filter((user, index) => {
        return (user.fullName.toLowerCase().includes(search.toLocaleLowerCase()) ||
          (user.userType.toLowerCase().includes(search.toLocaleLowerCase())));
      });
    }
  }
}
