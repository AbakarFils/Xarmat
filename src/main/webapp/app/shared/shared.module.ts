import { NgModule, CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';
import { CocojiSharedLibsModule, CocojiSharedCommonModule, JhiLoginModalComponent, HasAnyAuthorityDirective } from './';

@NgModule({
  imports: [CocojiSharedLibsModule, CocojiSharedCommonModule],
  declarations: [JhiLoginModalComponent, HasAnyAuthorityDirective],
  entryComponents: [JhiLoginModalComponent],
  exports: [CocojiSharedCommonModule, JhiLoginModalComponent, HasAnyAuthorityDirective],
  schemas: [CUSTOM_ELEMENTS_SCHEMA]
})
export class CocojiSharedModule {
  static forRoot() {
    return {
      ngModule: CocojiSharedModule
    };
  }
}
