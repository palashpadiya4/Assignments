import { Component, NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AddProductComponent } from './add-product/add-product.component';
import { DashboardComponent } from './pages/admin/dashboard/dashboard.component';
import { WelcomeComponent } from './pages/admin/welcome/welcome.component';
import { HomeComponent } from './pages/home/home.component';
import { LoginComponent } from './pages/login/login.component';
import { ProfileComponent } from './pages/profile/profile.component';
import { SignupComponent } from './pages/signup/signup.component';
import { UserDashboardComponent } from './pages/user/user-dashboard/user-dashboard.component';
import { AdminGuard } from './services/admin.guard';
import { NormalGuard } from './services/normal.guard';

const routes: Routes = [
  {
    path: '',
    component: HomeComponent,
  pathMatch : 'full',
  },
  {
    path: 'login',
    component: LoginComponent,
  pathMatch : 'full',
  },
  {
    path: 'user-dashboard',
    component: UserDashboardComponent,
    canActivate : [NormalGuard],
    children:[
   
    {
      path:'userprofile',
      component:ProfileComponent,

    }]
  },
  {
    path: 'admin',
    component: DashboardComponent,
  canActivate : [AdminGuard],
  children:[
    {
      path:'',
      component: WelcomeComponent,
    },
    {
      path:'profile',
      component:ProfileComponent,

    },
    {
      path:'addproducts',
      component:AddProductComponent,

    },
  ]
  },
{
  path: 'signup',
  component: SignupComponent,
pathMatch : 'full',
}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
