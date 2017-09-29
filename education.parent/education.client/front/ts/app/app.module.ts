import {NgModule} from "@angular/core";
import {AppComponent} from "./app.component";
import {BrowserModule} from "@angular/platform-browser";
import {HttpService} from "../service/HttpService";
import {HttpModule} from "@angular/http";
import {
    MdButtonModule, MdButtonToggleModule, MdCardModule, MdFormFieldModule, MdInputModule,
    MdToolbarModule
} from "@angular/material";
import {AuthComponent} from "./auth.component";
import {FormsModule} from "@angular/forms";
import {BrowserAnimationsModule} from "@angular/platform-browser/animations";

@NgModule({
    imports: [BrowserModule,
        HttpModule,
        FormsModule,
        MdButtonModule,
        MdInputModule,
        MdToolbarModule,
        MdCardModule,
        MdFormFieldModule,
        BrowserAnimationsModule
    ],
    declarations: [AppComponent, AuthComponent],
    bootstrap: [AppComponent],
    providers: [HttpService]
})
export class AppModule {

}
