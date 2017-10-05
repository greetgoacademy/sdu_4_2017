import {Component, OnChanges, OnInit, SimpleChanges} from "@angular/core";
import {HttpService} from "../../../service/HttpService";
import {ClientDataSource} from "./data-source/client.data-source";
import {ClientInfo} from "../../../model/main.main-tab-1/ClientInfo";

@Component({
    selector:'client-table',
    //language=Angular2HTML
    template:`
        <md-table #table [dataSource]="dataSource">
            <ng-container mdColumnDef="id">
                <md-header-cell *mdHeaderCellDef> ID </md-header-cell>
                <md-cell *mdCellDef="let row"> {{row.id}} </md-cell>
            </ng-container>
            
            <ng-container mdColumnDef="surname">
                <md-header-cell *mdHeaderCellDef> Surname </md-header-cell>
                <md-cell *mdCellDef="let row"> {{row.surname}} </md-cell>
            </ng-container>
            
            <ng-container mdColumnDef="name">
                <md-header-cell *mdHeaderCellDef> Name </md-header-cell>
                <md-cell *mdCellDef="let row"> {{row.name}} </md-cell>
            </ng-container>
            
            <ng-container mdColumnDef="patronymic">
                <md-header-cell *mdHeaderCellDef> Patronymic </md-header-cell>
                <md-cell *mdCellDef="let row"> {{row.patronymic}} </md-cell>
            </ng-container>

            <ng-container mdColumnDef="birthDate">
                <md-header-cell *mdHeaderCellDef> Birth Date </md-header-cell>
                <md-cell *mdCellDef="let row"> {{row.birthDate}} </md-cell>
            </ng-container>

            <ng-container mdColumnDef="age">
                <md-header-cell *mdHeaderCellDef> Age </md-header-cell>
                <md-cell *mdCellDef="let row"> {{row.age}} </md-cell>
            </ng-container>

            <md-header-row *mdHeaderRowDef="displayedColumns"></md-header-row>
            <md-row *mdRowDef="let row; columns: displayedColumns;"
                    class="md-row" 
                    [ngClass]="{'highlight': selectedId == row.id}" 
                    (click)="getId(row)"></md-row>
        </md-table>
    `
})
export class ClientTableComponent implements OnChanges,OnInit{

    private displayedColumns = ['id', 'surname', 'name', 'patronymic','birthDate','age'];
    private dataSource:ClientDataSource|null;
    private selectedId:string;

    constructor(private httpService:HttpService){

    }

    ngOnInit(): void {
        this.dataSource=new ClientDataSource(this.httpService);
    }

    ngOnChanges(changes: SimpleChanges): void {

    }

    getId(row:ClientInfo): void{
        console.log(row.id);
        this.selectedId=row.id;
    }
}
