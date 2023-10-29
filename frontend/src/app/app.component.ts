import { Component } from '@angular/core';
        import { HttpClient } from '@angular/common/http';

        @Component({
          selector: 'app-root',
          template: \`<div *ngFor="let employe of employes">{{ employe.nom }} {{ employe.prenom }}</div>\`,
          styles: []
        })
        export class AppComponent {
          employes: any[] = [];

          constructor(private http: HttpClient) {
            this.http.get('/api/employes').subscribe(data => {
              this.employes = data as any[];
            });
          }
        }