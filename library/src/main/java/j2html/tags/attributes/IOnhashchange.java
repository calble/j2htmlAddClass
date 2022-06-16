package j2html.tags.attributes;

import j2html.tags.Tag;
import j2html.tags.IInstance;

public interface IOnhashchange<T extends Tag<T>> extends IInstance<T>  {
default T withOnhashchange(final String onhashchange_) {return self().attr("onhashchange", onhashchange_);
}
default T withCondOnhashchange(final boolean enable, final String onhashchange_) {if (enable){
self().attr("onhashchange", onhashchange_);
}
return self();
}
}
