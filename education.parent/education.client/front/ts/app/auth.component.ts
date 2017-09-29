import {Component} from "@angular/core";
@Component({
    selector: 'auth-component',
    template:`
        <div class="container">
    <div class="row">
        <div class="center-block top" style="width:300px;background-color:#ccc;">
            <md-card flex="flex" flex-gt-sm="50" flex-gt-md="33">
                <md-toolbar>
                    <div>
                        <h2><span>Login Form</span></h2>
                    </div>
                </md-toolbar>
                <md-card-content>
                    <form name="Form">
                        <md-input-container class="md-block" style="width: 100%">
                            <input mdInput placeholder="Login" >
                        </md-input-container>
                        <md-input-container class="md-block" style="width: 100%">
                            <input mdInput placeholder="Password">
                        </md-input-container>
                    </form>
                </md-card-content>
            </md-card>
        </div>
    </div>
        </div>
    `
})
export class AuthComponent {

}
