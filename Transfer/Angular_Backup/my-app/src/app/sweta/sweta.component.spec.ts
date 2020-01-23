import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { SwetaComponent } from './sweta.component';

describe('SwetaComponent', () => {
  let component: SwetaComponent;
  let fixture: ComponentFixture<SwetaComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ SwetaComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(SwetaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
