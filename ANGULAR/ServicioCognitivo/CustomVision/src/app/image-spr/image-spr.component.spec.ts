import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ImageSprComponent } from './image-spr.component';

describe('ImageSprComponent', () => {
  let component: ImageSprComponent;
  let fixture: ComponentFixture<ImageSprComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ImageSprComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ImageSprComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
