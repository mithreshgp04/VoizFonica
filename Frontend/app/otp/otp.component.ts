// import { Component, OnInit } from '@angular/core';
// import { ActivatedRoute } from '@angular/router';
// import { AlertService } from 'ngx-alerts';
// import { ProgressbarService } from 'src/app/shared/services/progressbar.service';
// import { AuthService } from '../auth.service';


// @Component({
//   selector: 'app-confirm-email',
//   templateUrl: './confirm-email.component.html',
//   styleUrls: ['./confirm-email.component.scss'],
// })
// export class OtpComponent implements OnInit {
//   emailConfirmed: boolean = false;
//   urlParams: any = {};

//   constructor(
//     private route: ActivatedRoute,
//     private authService: AuthService,
//     public progressBar: ProgressbarService,
//     private alertService: AlertService
//   ) {}

//   ngOnInit() {
//     this.urlParams.token = this.route.snapshot.queryParamMap.get('token');
//     this.urlParams.userid = this.route.snapshot.queryParamMap.get('userid');
//     this.confirmEmail();
//   }

//   confirmEmail() {
//     this.progressBar.startLoading();
//     this.authService.confirmEmail(this.urlParams).subscribe(
//       () => {
//         this.progressBar.setSuccess();
//         console.log('success');
//         this.alertService.success('Email Confirmed');
//         this.progressBar.completeLoading();
//         this.emailConfirmed = true;
//       },
//       (error: any) => {
//         this.progressBar.setFailure();
//         console.log(error);
//         this.alertService.danger('Unable to confirm email');
//         this.progressBar.completeLoading();
//         this.emailConfirmed = false;
//       }
//     );
//   }
// }

import { Component, OnInit, ViewChildren, ElementRef } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
@Component({
  selector: 'app-otp',
  templateUrl: './otp.component.html',
  styleUrls: ['./otp.component.css']
})
export class OtpComponent implements OnInit {
  title = 'otp';
  form: FormGroup;
  formInput = ['input1', 'input2', 'input3', 'input4', 'input5', 'input6'];
  @ViewChildren('formRow') rows: any;

  ngOnInit() {

  }

  constructor() {
    this.form = this.toFormGroup(this.formInput);
  }

  toFormGroup(elements: any[]) {
    const group: any = {};

    elements.forEach(key => {
      group[key] = new FormControl('', Validators.required);
    });
    return new FormGroup(group);
  }

  keyUpEvent(event: { keyCode: number; which: number; }, index: number) {
    let pos = index;
    if (event.keyCode === 8 && event.which === 8) {
      pos = index - 1 ;
    } else {
      pos = index + 1 ;
    }
    if (pos > -1 && pos < this.formInput.length ) {
      this.rows._results[pos].nativeElement.focus();
    }

  }
  

  onSubmit() {
    console.log(this.form.value);
  }

}