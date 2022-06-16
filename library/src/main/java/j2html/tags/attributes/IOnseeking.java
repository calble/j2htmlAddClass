package j2html.tags.attributes;

import j2html.tags.Tag;
import j2html.tags.IInstance;

public interface IOnseeking<T extends Tag<T>> extends IInstance<T>  {
default T withOnseeking(final String onseeking_) {return self().attr("onseeking", onseeking_);
}
default T withCondOnseeking(final boolean enable, final String onseeking_) {if (enable){
self().attr("onseeking", onseeking_);
}
return self();
}
}
