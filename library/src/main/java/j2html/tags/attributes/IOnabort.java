package j2html.tags.attributes;

import j2html.tags.Tag;
import j2html.tags.IInstance;

public interface IOnabort<T extends Tag<T>> extends IInstance<T>  {
default T withOnabort(final String onabort_) {return self().attr("onabort", onabort_);
}
default T withCondOnabort(final boolean enable, final String onabort_) {if (enable){
self().attr("onabort", onabort_);
}
return self();
}
}
