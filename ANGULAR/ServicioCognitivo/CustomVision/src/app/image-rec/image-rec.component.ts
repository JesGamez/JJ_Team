import { MsServiceService } from './../ms-service.service';
import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-image-rec',
  templateUrl: './image-rec.component.html',
  styleUrls: ['./image-rec.component.css']
})
export class ImageRecComponent implements OnInit {

  imageURLPreview = '';
  analizedImageData: any;
  imageURL:any;

  constructor(private msService: MsServiceService) { }

  ngOnInit(): void {
  }

  analyzeImage(imageData: NgForm){
    console.log(imageData.value.imageURL);
    this.imageURLPreview = imageData.value.imageURL;
    
    this.msService.computerVisionService(this.imageURLPreview).subscribe(res=>{
      console.log(res);
      this.analizedImageData = res;
    }, (err)=>{
      console.log(err);
    });
    imageData.reset();
  }

}
