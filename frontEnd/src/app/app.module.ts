import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { SideNavOuterToolbarModule, SideNavInnerToolbarModule, SingleCardModule } from './layouts';
import {
  FooterModule,
  ResetPasswordFormModule,
  CreateAccountFormModule,
  ChangePasswordFormModule,
  LoginFormModule,
  CidadeEstadoModule
} from './shared/components';
import { AuthService, ScreenService, AppInfoService } from './shared/services';
import { UnauthenticatedContentModule } from './unauthenticated-content';
import { AppRoutingModule } from './app-routing.module';
import {HomeComponent} from './pages/home/home.component';
import {ProfileComponent} from './pages/profile/profile.component';
import {TasksComponent} from './pages/tasks/tasks.component';
import {ShowComponent} from './pages/show/show.component';
import {DxButtonModule, DxDataGridModule, DxFormModule, DxListModule} from 'devextreme-angular';
import {HttpClientModule} from '@angular/common/http';
import { NotaFiscalComponent } from './pages/nota-fiscal/nota-fiscal.component';
import { ContribuinteComponent } from './pages/contribuinte/contribuinte.component';

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    ProfileComponent,
    TasksComponent,
    ShowComponent,
    NotaFiscalComponent,
    ContribuinteComponent,

  ],
  imports: [
    BrowserModule,
    SideNavOuterToolbarModule,
    SideNavInnerToolbarModule,
    SingleCardModule,
    FooterModule,
    ResetPasswordFormModule,
    CreateAccountFormModule,
    ChangePasswordFormModule,
    LoginFormModule,
    UnauthenticatedContentModule,
    CidadeEstadoModule,
    AppRoutingModule,
    DxDataGridModule,
    DxFormModule,
    DxListModule,
    DxButtonModule,
  ],
  providers: [
    AuthService,
    ScreenService,
    AppInfoService
  ],
  exports: [
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
