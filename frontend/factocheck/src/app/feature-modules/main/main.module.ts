import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { ChecklistPageComponent } from './pages/checklist-page/checklist-page.component';
import { MainSharedComponentsModule } from './main-shared-components/main-shared-components.module';

@NgModule({
  declarations: [ChecklistPageComponent],
  imports: [
    CommonModule,
    MainSharedComponentsModule
  ],
  exports: [
    ChecklistPageComponent
  ]
})
export class MainModule { }
