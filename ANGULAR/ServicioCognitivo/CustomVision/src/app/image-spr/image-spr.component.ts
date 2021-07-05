import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-image-spr',
  templateUrl: './image-spr.component.html',
  styleUrls: ['./image-spr.component.css']
})
export class ImageSprComponent implements OnInit {

  imageURLPreview = '';
  analizedImageData: any;
  imageURL:any;

  title = '';
  descripcion = '';

  constructor(private http: HttpClient) { }

  ngOnInit(): void {

    this.http.get("http://localhost:8080/predecir",{responseType: 'text'}).subscribe((resp: any) => {
      this.descripcion = resp,
      this.title = resp }
    )

    // ,

    // this.http.get("http://localhost:8080/nombre",{responseType: 'text'}).subscribe((resp: any) => {
    //   this.title = resp;
    // }
    // )

  }

  analyzeImage(imageData: NgForm){
    console.log(imageData.value.imageURL);
    this.imageURLPreview = imageData.value.imageURL;
  }

}
