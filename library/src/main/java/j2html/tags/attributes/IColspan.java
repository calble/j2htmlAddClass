package j2html.tags.attributes;

import j2html.tags.Tag;
import j2html.tags.IInstance;

public interface IColspan<T extends Tag<T>> extends IInstance<T>  {
default T withColspan(final String colspan_) {return self().attr("colspan", colspan_);
}
default T withCondColspan(final boolean enable, final String colspan_) {if (enable){
self().attr("colspan", colspan_);
}
return self();
}
}
