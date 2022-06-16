package j2html.tags.attributes;

import j2html.tags.Tag;
import j2html.tags.IInstance;

public interface IOnstalled<T extends Tag<T>> extends IInstance<T>  {
default T withOnstalled(final String onstalled_) {return self().attr("onstalled", onstalled_);
}
default T withCondOnstalled(final boolean enable, final String onstalled_) {if (enable){
self().attr("onstalled", onstalled_);
}
return self();
}
}
