import { Directive, ElementRef, Renderer2, HostListener, HostBinding } from '@angular/core';

@Directive({
  selector: '[appColor]'
})
export class ColorDirective {

  constructor(private el: ElementRef, private renderer: Renderer2) {
    // Below two style we can apply with selector appColor anywhere like index of products etc
    // this.el.nativeElement.style.background = 'red' ;
    // this.el.nativeElement.style.fontSize = '30px';


    // using renderer
    let h1 = this.renderer.createElement('h1');
    let text = this.renderer.createText('Hello from custom directives');
    this.renderer.appendChild(h1, text);
    this.renderer.appendChild(this.el.nativeElement, h1);
  }

  // HostBinding , used to decorate class properties;
  @HostBinding('style.background') backgroundColor: string;


  // Changing based on an event
  @HostListener('mouseenter')
  x() {
    //  this.el.nativeElement.style.background = '#ccc';
    this.backgroundColor = 'lightgreen';
    this.el.nativeElement.style.color = 'red';
    this.el.nativeElement.style.fontSize = '25px';
  }

  @HostListener('mouseleave')
  y() {
    this.el.nativeElement.style.background = 'lightblue';
    this.el.nativeElement.style.color = 'black';
    this.el.nativeElement.style.color = 'red';
    this.el.nativeElement.style.fontSize = '16px';
  }
}

