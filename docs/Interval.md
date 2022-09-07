

# Interval

This type is used by the <strong>intervals</strong> container to define the opening and closing times of a store's working day. Local time (in Military format) is used, with the following format: <code>hh:mm:ss</code>.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**close** | **String** | The &lt;strong&gt;close&lt;/strong&gt; value is actually the time that the store closes. Local time (in Military format) is used. So, if a store closed at 8 PM local time, the &lt;strong&gt;close&lt;/strong&gt; time would look like the following: &lt;code&gt;20:00:00&lt;/code&gt;. This field is conditionally required if the &lt;strong&gt;intervals&lt;/strong&gt; container is used to specify working hours or special hours for a store. &lt;br&gt;&lt;br&gt;This field is returned if set for the store location. |  [optional]
**open** | **String** | The &lt;strong&gt;open&lt;/strong&gt; value is actually the time that the store opens. Local time (in Military format) is used. So, if a store opens at 9 AM local time, the &lt;strong&gt;close&lt;/strong&gt; time would look like the following: &lt;code&gt;09:00:00&lt;/code&gt;. This field is conditionally required if the &lt;strong&gt;intervals&lt;/strong&gt; container is used to specify working hours or special hours for a store. &lt;br&gt;&lt;br&gt;This field is returned if set for the store location. |  [optional]


## Implemented Interfaces

* Serializable


