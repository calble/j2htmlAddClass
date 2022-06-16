package j2html.tags.attributes;

import j2html.tags.Tag;
import j2html.tags.IInstance;

public interface IOnunload<T extends Tag<T>> extends IInstance<T>  {
default T withOnunload(final String onunload_) {return self().attr("onunload", onunload_);
}
default T withCondOnunload(final boolean enable, final String onunload_) {if (enable){
self().attr("onunload", onunload_);
}
return self();
}
}
