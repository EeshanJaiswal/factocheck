import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

// components imports
import { DataInputComponent } from '@feature/main/main-shared-components/data-input/data-input.component';
import { ShiftTableComponent } from '@feature/main/main-shared-components/shift-table/shift-table.component';

import { AngularSvgIconModule } from 'angular-svg-icon';
import { NgToggleModule } from 'ng-toggle-button';




@NgModule({
  declarations: [DataInputComponent, ShiftTableComponent, ],
  imports: [
    CommonModule,
    AngularSvgIconModule.forRoot(),
    NgToggleModule
  ],
  exports: [DataInputComponent, ShiftTableComponent]
})
export class MainSharedComponentsModule { }
