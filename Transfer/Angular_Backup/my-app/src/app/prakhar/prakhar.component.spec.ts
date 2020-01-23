import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { PrakharComponent } from './prakhar.component';

describe('PrakharComponent', () => {
  let component: PrakharComponent;
  let fixture: ComponentFixture<PrakharComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ PrakharComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(PrakharComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
