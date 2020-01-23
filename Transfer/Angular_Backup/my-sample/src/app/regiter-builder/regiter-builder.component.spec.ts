import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { RegiterBuilderComponent } from './regiter-builder.component';

describe('RegiterBuilderComponent', () => {
  let component: RegiterBuilderComponent;
  let fixture: ComponentFixture<RegiterBuilderComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ RegiterBuilderComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(RegiterBuilderComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
