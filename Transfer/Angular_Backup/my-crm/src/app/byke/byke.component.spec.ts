import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { BykeComponent } from './byke.component';

describe('BykeComponent', () => {
  let component: BykeComponent;
  let fixture: ComponentFixture<BykeComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ BykeComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(BykeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
