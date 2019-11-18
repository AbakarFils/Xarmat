import { NgModule, CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';
import { XarmatSharedLibsModule, XarmatSharedCommonModule, JhiLoginModalComponent, HasAnyAuthorityDirective } from './';

@NgModule({
  imports: [XarmatSharedLibsModule, XarmatSharedCommonModule],
  declarations: [JhiLoginModalComponent, HasAnyAuthorityDirective],
  entryComponents: [JhiLoginModalComponent],
  exports: [XarmatSharedCommonModule, JhiLoginModalComponent, HasAnyAuthorityDirective],
  schemas: [CUSTOM_ELEMENTS_SCHEMA]
})
export class XarmatSharedModule {
  static forRoot() {
    return {
      ngModule: XarmatSharedModule
    };
  }
}
