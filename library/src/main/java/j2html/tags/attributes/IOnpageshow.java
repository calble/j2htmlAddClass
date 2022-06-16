package j2html.tags.attributes;

import j2html.tags.Tag;
import j2html.tags.IInstance;

public interface IOnpageshow<T extends Tag<T>> extends IInstance<T>  {
default T withOnpageshow(final String onpageshow_) {return self().attr("onpageshow", onpageshow_);
}
default T withCondOnpageshow(final boolean enable, final String onpageshow_) {if (enable){
self().attr("onpageshow", onpageshow_);
}
return self();
}
}
