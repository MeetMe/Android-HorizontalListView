# HorizontalListView

HorizontalListView is an Android ListView widget which scrolls in a horizontal manner (in contrast with the SDK-provided ListView which scrolls vertically).

## Usage
To use in an XML layout:
 0. Include The Library into your project
 0. Make sure you are running ADT version 17 or greater
 0. Add this XML namespace to your layout `xmlns:widget="http://schemas.android.com/apk/res-auto"`
 0. Create the HorizontalListView as `com.meetme.android.horizontallistview.HorizontalListView`

**Example**:

    <com.meetme.android.horizontallistview.HorizontalListView
        xmlns:android="http://schemas.android.com/apk/res/android"
        xmlns:widget="http://schemas.android.com/apk/res-auto"
        android:id="@+id/HorizontalListView"
        android:layout_width="fill_parent"
        android:layout_height="100dp"
        android:divider="#878787"
        widget:dividerWidth="2dp" />

Notice you set the `dividerWidth` via the XML namespace you just defined as it is a custom attribute. All other attributes can only be set normally via the `android` namespace.

## Known Issues
 - Currently this widget only supports uniform width items. When the item width is not uniform it leads to the UI rendering in inconsistent corrupted states.

## Known limitations
 - Does not support trackball/d-pad navigation
 - Does not support scroll bars
 - Does not support header or footer views
 - Does not support disabled items

## Contributors

 - [Bill Donahue](https://github.com/bdonahue)

## Licenses

This library licensed under the MIT license. This library makes use of code originally developed and licensed by [Paul Soucy](paul@dev-smart.com).

    The MIT License Copyright (c) 2011 Paul Soucy (paul@dev-smart.com)
    The MIT License Copyright (c) 2013 MeetMe, Inc.
    
    Permission is hereby granted, free of charge, to any person obtaining a copy of this software and
    associated documentation files (the "Software"), to deal in the Software without restriction,
    including without limitation the rights to use, copy, modify, merge, publish, distribute,
    sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is
    furnished to do so, subject to the following conditions:
    
    The above copyright notice and this permission notice shall be included in all copies or
    substantial portions of the Software.
    
    THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT
    NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
    NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM,
    DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
    OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
