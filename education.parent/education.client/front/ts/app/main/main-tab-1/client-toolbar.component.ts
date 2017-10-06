import {Component, OnChanges, OnInit, SimpleChanges} from "@angular/core";
import {HttpService} from "../../../service/HttpService";
import {MdDialog} from "@angular/material";
import {ClientEditWindowComponent} from "./client_edit_window.component";
import {ClientInfo} from "../../../model/main.main-tab-1/ClientInfo";

@Component({
    selector:"client-toolbar",
    inputs:["clientInfo"],
    template:`
        <md-toolbar style="background: none;">
            <button md-icon-button>
                <md-icon class="material-icons" (click)="showNumber()">add</md-icon>
            </button>
        </md-toolbar>
        <md-toolbar style="background: none;">
            <button md-icon-button [disabled]="disabled">
              <md-icon class="material-icons">edit</md-icon>
            </button>
        </md-toolbar>
        <md-toolbar style="background: none;">
            <button md-icon-button [disabled]="disabled">
              <md-icon class="material-icons">delete</md-icon>
            </button>
        </md-toolbar>
    `
})
export class ClientToolbarComponent implements OnChanges,OnInit{
    public animal:string;
    public clientInfoChange: ClientInfo|null;
    public disabled:true;

    constructor(private httpService:HttpService, private dialog:MdDialog){
    }
    ngOnChanges(changes: SimpleChanges): void {
        this.clientInfoChange=changes.clientInfo.currentValue;
        if(this.clientInfoChange){
            this.disabled=true;
        }
    }

    ngOnInit(): void {

    }

    showNumber(): void {

        let dialogRef=this.dialog.open(ClientEditWindowComponent,
            { width:'800px' });

    }
}
