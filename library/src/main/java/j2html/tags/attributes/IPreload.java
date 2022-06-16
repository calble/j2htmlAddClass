package j2html.tags.attributes;

import j2html.tags.Tag;
import j2html.tags.IInstance;

public interface IPreload<T extends Tag<T>> extends IInstance<T>  {
default T withPreload(final String preload_) {return self().attr("preload", preload_);
}
default T withCondPreload(final boolean enable, final String preload_) {if (enable){
self().attr("preload", preload_);
}
return self();
}
}
