import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { RouterModule, Routes } from '@angular/router';
import { HomepageComponent } from './homepage/homepage.component';
import { BookingComponent } from './booking/booking.component';
import {MatDatepickerModule} from '@angular/material/datepicker';
import {MatFormFieldModule} from '@angular/material/form-field';


const appRoutes: Routes = [
  {path: '', component: HomepageComponent},
  {path: 'booking', component: BookingComponent}
];

@NgModule({
  declarations: [
    AppComponent,
    HomepageComponent,
    BookingComponent
  ],
  imports: [
    BrowserModule,
    MatDatepickerModule,
    MatFormFieldModule,
    RouterModule.forRoot(appRoutes),
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
