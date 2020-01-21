import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'filterContract'
})
export class FilterContractPipe implements PipeTransform {

  transform(value: any, ...args: any[]): any {
    return null;
  }

}
