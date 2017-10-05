import {Component, OnChanges, OnInit, SimpleChanges} from "@angular/core";

@Component({
    selector:"client-toolbar",
    template:`
      <div><h1>Client Toolbar</h1></div>
    `
})
export class ClientToolbarComponent implements OnChanges,OnInit{
    ngOnChanges(changes: SimpleChanges): void {
    }

    ngOnInit(): void {
    }

}
