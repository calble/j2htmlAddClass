package j2html.tags.attributes;

import j2html.tags.Tag;
import j2html.tags.IInstance;

public interface IOntimeupdate<T extends Tag<T>> extends IInstance<T>  {
default T withOntimeupdate(final String ontimeupdate_) {return self().attr("ontimeupdate", ontimeupdate_);
}
default T withCondOntimeupdate(final boolean enable, final String ontimeupdate_) {if (enable){
self().attr("ontimeupdate", ontimeupdate_);
}
return self();
}
}
