import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { HarenComponent } from './haren.component';

describe('HarenComponent', () => {
  let component: HarenComponent;
  let fixture: ComponentFixture<HarenComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ HarenComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(HarenComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
