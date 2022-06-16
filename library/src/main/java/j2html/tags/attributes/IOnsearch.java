package j2html.tags.attributes;

import j2html.tags.Tag;
import j2html.tags.IInstance;

public interface IOnsearch<T extends Tag<T>> extends IInstance<T>  {
default T withOnsearch(final String onsearch_) {return self().attr("onsearch", onsearch_);
}
default T withCondOnsearch(final boolean enable, final String onsearch_) {if (enable){
self().attr("onsearch", onsearch_);
}
return self();
}
}
