package j2html.tags.attributes;

import j2html.tags.Tag;
import j2html.tags.IInstance;

public interface ISrcset<T extends Tag<T>> extends IInstance<T>  {
default T withSrcset(final String srcset_) {return self().attr("srcset", srcset_);
}
default T withCondSrcset(final boolean enable, final String srcset_) {if (enable){
self().attr("srcset", srcset_);
}
return self();
}
}
