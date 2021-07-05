import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ImageRecComponent } from './image-rec/image-rec.component';
import { ImageSprComponent } from './image-spr/image-spr.component';


const routes: Routes = [
  {path: 'image-rec', component: ImageRecComponent},
  {path: 'image-spr', component: ImageSprComponent}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }


