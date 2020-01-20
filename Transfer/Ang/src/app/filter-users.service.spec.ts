import { TestBed } from '@angular/core/testing';

import { FilterUsersService } from './filter-users.service';

describe('FilterUsersService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: FilterUsersService = TestBed.get(FilterUsersService);
    expect(service).toBeTruthy();
  });
});
