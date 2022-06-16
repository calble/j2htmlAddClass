package j2html.tags.attributes;

import j2html.tags.Tag;
import j2html.tags.IInstance;

public interface ICite<T extends Tag<T>> extends IInstance<T>  {
default T withCite(final String cite_) {return self().attr("cite", cite_);
}
default T withCondCite(final boolean enable, final String cite_) {if (enable){
self().attr("cite", cite_);
}
return self();
}
}
