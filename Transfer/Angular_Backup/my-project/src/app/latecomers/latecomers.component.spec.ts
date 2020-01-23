import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { LatecomersComponent } from './latecomers.component';

describe('LatecomersComponent', () => {
  let component: LatecomersComponent;
  let fixture: ComponentFixture<LatecomersComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ LatecomersComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(LatecomersComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
