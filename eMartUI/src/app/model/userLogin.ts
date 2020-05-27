
export class UserLogin {
  userName: string;
  password: string;
  userType: string;
  email: string;
  mobileNum: string;
  confirmed: string;
  crtDate: Date;
  crtName: string;
  isActive: string;

  constructor() {
    this.userName = '';
    this.password = '';
  }
}
