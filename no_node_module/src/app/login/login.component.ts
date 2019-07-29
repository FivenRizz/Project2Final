import { Component, OnInit } from '@angular/core';
import { User } from '../register/user';
import { UserServiceService } from '../user-service.service';
import { Router } from '@angular/router';
@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  user = new User();
  statusMessage: string;
  user1 = new User();
  isLogin: boolean;
  constructor(private router: Router, private _userService:UserServiceService) { }
  ngOnInit() {
  }
  ifloggedin():boolean{
if (+localStorage.getItem('user_id')!=null && +localStorage.getItem('user_id')!=0){
  return true;
}
else{
  return false;
}
  }
  fullLogin():void{
    this._userService.authenticate(this.user.userName, this.user.password)
    .subscribe((data)=>{console.log(data);
        this.isLogin=data;
        console.log(this.isLogin);
        if(this.isLogin==true){
          this._userService.getUser(this.user.userName, this.user.password)
          .subscribe((data)=>{console.log(data);
            console.log(data);
            console.log(localStorage.getItem('user_id'));
            this.user1 = <User> data;
            localStorage.setItem('user_user', String (this.user1.userName));
            localStorage.setItem('user_pass', String (this.user1.password));
            localStorage.setItem('user_id',String (this.user1.userId));
            console.log(localStorage.getItem('user_id'));
    this.router.navigate(['/UserHome']);
        },
        (error)=>{
          console.log(error);
          this.statusMessage = "Problem with service. Please try again later!";
        });
        }
        else{
          this.router.navigate(['/Login']);
        }
    },
    (error)=>{
      console.log(error);
      this.statusMessage = "Problem with service. Please try again later!";
    });
}
}
