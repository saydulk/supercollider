
// temp translations

// FLabel

CXLabel {
	classvar <>bgcolor;
	var >st;
	*new { arg layout,string,x,y=17,maxx=15;
		^super.new.st_(
			SCStaticText(layout.window,
					layout.layRight(x ?? { (string.size * 8.3).max(maxx) },y)
			).string_(string)
			.background_(bgcolor)
		)
	}
	label_ { arg string;
		st.string_(string);
	}

}
