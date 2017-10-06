import {Component, Inject, OnInit} from "@angular/core";
import {MD_DIALOG_DATA, MdDialogRef} from "@angular/material";
@Component({
    selector:'client_edit',
    template:`
        <md-toolbar class="md-default-theme">
            <div class="md-toolbar-tools">Client Info</div>
        </md-toolbar>
        <div md-dialog-content>
            <md-input-container class="md-block" style="width: 100%">
                <input mdInput placeholder="Surname" name="fieldSurname"
                       [(ngModel)]="fieldSurname"  [disabled]="disabled" required>
                <md-error>This field is required</md-error>
            </md-input-container>
            <md-input-container class="md-block" style="width: 100%">
                <input mdInput placeholder="Name" name="fieldName"
                       [(ngModel)]="fieldName"  [disabled]="disabled" required>
                <md-error>This field is required</md-error>
            </md-input-container>
            <md-input-container class="md-block" style="width: 100%">
                <input mdInput placeholder="Patronymic" name="fieldPatronymic"
                       [(ngModel)]="fieldPatronymic"  [disabled]="disabled" required>
                <md-error>This field is required</md-error>
            </md-input-container>
            <md-input-container class="md-block" style="width: 100%">
                <input mdInput type="number" placeholder="Age" name="fieldAge"
                       [(ngModel)]="fieldAge"  [disabled]="disabled" required>
                <md-error>This field is required</md-error>
            </md-input-container>
        </div>
        <div md-dialog-actions>
            <button md-button [md-dialog-close]="data.animal" tabindex="2">Save</button>
            <button md-button (click)="onNoClick()" tabindex="-1">Cancel</button>
        </div>
    `
})
export class ClientEditWindowComponent implements OnInit{
    private fieldName:string;
    private fieldSurname:string;
    private fieldPatronymic:string;
    private fieldAge:number;

    constructor(private dialogRef:MdDialogRef<ClientEditWindowComponent>,
                @Inject(MD_DIALOG_DATA) public data: any){

    }

    onNoClick(): void {
        this.dialogRef.close();
    }

    ngOnInit(): void {
        console.log('ClientEditWindowComponent');
    }

}
