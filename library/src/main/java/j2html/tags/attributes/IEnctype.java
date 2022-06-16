package j2html.tags.attributes;

import j2html.tags.Tag;
import j2html.tags.IInstance;

public interface IEnctype<T extends Tag<T>> extends IInstance<T>  {
default T withEnctype(final String enctype_) {return self().attr("enctype", enctype_);
}
default T withCondEnctype(final boolean enable, final String enctype_) {if (enable){
self().attr("enctype", enctype_);
}
return self();
}
}
