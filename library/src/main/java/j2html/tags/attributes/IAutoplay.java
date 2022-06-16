package j2html.tags.attributes;

import j2html.tags.Tag;
import j2html.tags.IInstance;

public interface IAutoplay<T extends Tag<T>> extends IInstance<T>  {
default T isAutoplay() {self().attr("autoplay");
return self();
}
default T withCondAutoplay(final boolean enable) {if (enable){
self().attr("autoplay");
}
return self();
}
}
