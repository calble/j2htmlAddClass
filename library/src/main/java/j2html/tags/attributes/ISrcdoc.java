package j2html.tags.attributes;

import j2html.tags.Tag;
import j2html.tags.IInstance;

public interface ISrcdoc<T extends Tag<T>> extends IInstance<T>  {
default T withSrcdoc(final String srcdoc_) {return self().attr("srcdoc", srcdoc_);
}
default T withCondSrcdoc(final boolean enable, final String srcdoc_) {if (enable){
self().attr("srcdoc", srcdoc_);
}
return self();
}
}
