import {Component} from "@angular/core";
@Component({
    selector: 'auth-component',
    template: `
<div>
  <md-form-field class="example-full-width">
    <input mdInput placeholder="Company (disabled)" disabled value="Google">
  </md-form-field>

  <table class="example-full-width" cellspacing="0"><tr>
    <td><md-form-field class="example-full-width">
      <input mdInput placeholder="First name">
    </md-form-field></td>
    <td><md-form-field class="example-full-width">
      <input mdInput placeholder="Long Last Name That Will Be Truncated">
    </md-form-field></td>
  </tr></table>

  <p>
    <md-form-field class="example-full-width">
      <textarea mdInput placeholder="Address">1600 Amphitheatre Pkwy</textarea>
    </md-form-field>
    <md-form-field class="example-full-width">
      <textarea mdInput placeholder="Address 2"></textarea>
    </md-form-field>
  </p>

  <table class="example-full-width" cellspacing="0"><tr>
    <td><md-form-field class="example-full-width">
      <input mdInput placeholder="City">
    </md-form-field></td>
    <td><md-form-field class="example-full-width">
      <input mdInput placeholder="State">
    </md-form-field></td>
    <td><md-form-field class="example-full-width">
      <input mdInput #postalCode maxlength="5" placeholder="Postal Code" value="94043">
      <md-hint align="end">{{postalCode.value.length}} / 5</md-hint>
    </md-form-field></td>
  </tr></table>
</div>
`
})
export class AuthComponent {

}