import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class MsServiceService {

  constructor(private http: HttpClient) { }

  public computerVisionService(imageURL: string){
    const API =
    'https://{tu endpoint}vision/v2.0/analyze?visualFeatures=Categories,Description,Tags,Color,Brands,Faces,ImageType';
    
  const headers =  new HttpHeaders(
      {
        'Content-Type': 'application/json',
        'Ocp-Apim-Subscription-Key': '{tu apikey}'
      }
    );
    return this.http.post(API, {url: imageURL}, {headers: headers})
  
  }

}
