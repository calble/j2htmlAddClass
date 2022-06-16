package j2html.tags.attributes;

import j2html.tags.Tag;
import j2html.tags.IInstance;

public interface IOnplaying<T extends Tag<T>> extends IInstance<T>  {
default T withOnplaying(final String onplaying_) {return self().attr("onplaying", onplaying_);
}
default T withCondOnplaying(final boolean enable, final String onplaying_) {if (enable){
self().attr("onplaying", onplaying_);
}
return self();
}
}
