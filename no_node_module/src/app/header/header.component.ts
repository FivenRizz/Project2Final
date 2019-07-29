import { Component, OnInit } from '@angular/core';

import { User } from '../register/user';
import { UserServiceService } from '../user-service.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit {

  recoverUser = new User();

  constructor(private router: Router, private userService: UserServiceService) { }

  ngOnInit() {
  } // ngOnInit()

  recoverPassword(recoverUser: User): void {
    console.log("In recoverPassword");
    if(this.checkUser(this.recoverUser)) {
      this.router.navigate(['/Success']);
    }
    else {
      this.router.navigate(['/Home']);
    }
  } // recoverPassword()

  checkUser(recoverUser: User) {
    console.log("In checkUser");
    if (this.userService.recoverUser(this.recoverUser).subscribe((Response) => {console.log(Response)})) {
      return true;
    }
    else {
      return false;
    }
  } // checkUser()

  sendEmail() {
  } // getUser()

} // HeaderComponent
