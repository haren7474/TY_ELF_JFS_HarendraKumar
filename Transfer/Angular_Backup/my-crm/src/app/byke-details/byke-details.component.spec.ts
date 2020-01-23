import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { BykeDetailsComponent } from './byke-details.component';

describe('BykeDetailsComponent', () => {
  let component: BykeDetailsComponent;
  let fixture: ComponentFixture<BykeDetailsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ BykeDetailsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(BykeDetailsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
